package com.exam.metering;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

public class profileEditActivity extends AppCompatActivity{// implements OnClickListener {
    //글자 수 count
    TextView tv;

    /**
     * 학력상태 스피터
     */
    String[] arr = {"재학", "휴학"};
    ArrayAdapter<String> arrayAdapter;
    private Spinner spinner;

    /**
     * 사진 선택, CircleImageView
     */
    private static final int PERMISSION_FILE = 23;
    private static final int ACCESS_FILE = 23;
    de.hdodenhof.circleimageview.CircleImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);

        tv = (TextView) findViewById((R.id.wordCount_tv));

        /**
         * 사진 선택, CircleImageView
         */
        img = findViewById(R.id.profile_img);
        img.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(profileEditActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(profileEditActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSION_FILE);

                }else{
                    Intent intent = new Intent();
                    intent.setType("image/*");
                    intent.setAction(Intent.ACTION_PICK);
                    startActivityForResult(Intent.createChooser(intent, "img check"), ACCESS_FILE);
                }
            }
        });


        /**
         * 학력상태 스피터
         */
        EditText editText = (EditText)findViewById((R.id.indroduce_edit));
        editText.setFilters(new InputFilter[] { new InputFilter.LengthFilter(80) });
        editText.addTextChangedListener(new myTextWatcher());

        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                R.layout.univer_status_text, arr);

        spinner = (Spinner)findViewById(R.id.status_spin);
        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(0);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //arr[i]로받음, //l은 id 0 1 2 3 4
            }
            @Override public void onNothingSelected(AdapterView<?> adapterView) { } });
    }

    /**
     * 글자수 count
     */
    public class myTextWatcher implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) { }
        @Override
        public void afterTextChanged(Editable s) {
            tv.setText(s.length() + " / 80 글자");
        }
    }

    /**
     * 사진 선택, CircleImageView
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == ACCESS_FILE && resultCode == Activity.RESULT_OK && data != null && data.getData() != null){
            Uri FILE_URI = data.getData();
            CropImage.activity(FILE_URI)
                    .setGuidelines(CropImageView.Guidelines.ON)
                    .setCropShape(CropImageView.CropShape.OVAL)
                    .setFixAspectRatio(true)
                    .setActivityTitle("프로필 사진")
                    .setCropMenuCropButtonTitle("완료")
                    .start(this);
        }

        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode == RESULT_OK) {
                Uri resultUri = result.getUri();
                img.setImageURI(resultUri);
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                Exception error = result.getError();
            }
        }
    }

    //    private void doTakeAlbumAction()
//    {
//        // 앨범 호출
//        Intent intent = new Intent(Intent.ACTION_PICK);
//        intent.setType(android.provider.MediaStore.Images.Media.CONTENT_TYPE);
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, mImageCaptureUri);
//        startActivityForResult(intent, 1);
//    }
//
//    @Overridegi
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode != RESULT_OK) {
//            return;
//        }
//
//        switch (requestCode) {
//            case 2:
//            {
//                // 크롭이 된 이후의 이미지를 넘겨 받습니다.
//                // 이미지뷰에 이미지를 보여준다거나 부가적인 작업 이후에
//                // 임시 파일을 삭제합니다.
//                final Bundle extras = data.getExtras();
//
//                if(extras != null)
//                {
//                    Bitmap photo = extras.getParcelable("data");
//                    img.setImageBitmap(photo);
//                }
//
//                // 임시 파일 삭제
//                File f = new File(mImageCaptureUri.getPath());
//                if(f.exists())
//                {
//                    f.delete();
//                }
//
//                break;
//            }
//
//            case 1: {
//                // 이후의 처리가 카메라와 같으므로 일단  break없이 진행합니다.
//                // 실제 코드에서는 좀더 합리적인 방법을 선택하시기 바랍니다.
//                mImageCaptureUri = data.getData();
//                img.setImageURI(mImageCaptureUri);
//                Intent intent = new Intent("com.android.camera.action.CROP");
//                intent.setFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
//                intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
//                intent.setDataAndType(mImageCaptureUri, "image/*");
//                intent.putExtra("outputX", 90);
//                intent.putExtra("outputY", 90);
//                intent.putExtra("aspectX", 1);
//                intent.putExtra("aspectY", 1);
//                intent.putExtra("scale", true);
//                intent.putExtra("return-data", true);
//                startActivityForResult(intent, 2);
//                break;
//
//            }
//        }
//    }
//
//    @Override
//    public void onClick(View view) {
//
//        DialogInterface.OnClickListener albumListener = new DialogInterface.OnClickListener()
//        {
//            @Override
//            public void onClick(DialogInterface dialog, int which)
//            {
//                doTakeAlbumAction();
//            }
//        };
//
//        DialogInterface.OnClickListener cancelListener = new DialogInterface.OnClickListener()
//        {
//            @Override
//            public void onClick(DialogInterface dialog, int which)
//            {
//                dialog.dismiss();
//            }
//        };
//
//        new AlertDialog.Builder(this)
//                .setTitle("업로드할 이미지 선택")
//                .setNeutralButton("앨범선택", albumListener)
//                .setNegativeButton("취소", cancelListener)
//                .show();
//    }
}