package com.dendev.millionaire.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

public class EnterNameDialog extends DialogFragment {
    private EditText editFirstName, editSecName;

    private OnNameSavedListener onNameSavedListener;


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        builder.setView(getLayout());
        builder.setPositiveButton("save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                onNameSavedListener.onSaved(editFirstName.getText().toString(),
                        editSecName.getText().toString());
            }
        });
        return builder.create();
    }

    public void setOnNameSavedListener(OnNameSavedListener onNameSavedListener) {
        this.onNameSavedListener = onNameSavedListener;
    }

    private View getLayout() {
        editFirstName = new EditText(getContext());
        editSecName = new EditText(getContext());

        LinearLayout.LayoutParams lp =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT);
        editFirstName.setLayoutParams(lp);
        editFirstName.setInputType(InputType.TYPE_CLASS_TEXT |
                InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
        editSecName.setLayoutParams(lp);
        editSecName.setInputType(InputType.TYPE_CLASS_TEXT |
                InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);
        editFirstName.setText("FirstName");
        editSecName.setText("SecName");
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(lp);
        linearLayout.addView(editFirstName);
        linearLayout.addView(editSecName);
        return linearLayout;
    }
}
