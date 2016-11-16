package com.example.mambayamba.stackoverflowviewer.screen;

import android.app.ProgressDialog;
import android.content.Context;

import com.example.mambayamba.stackoverflowviewer.R;

/**
 * Created by mambayamba on 16.11.2016.
 */
public class DownloadDialog extends ProgressDialog {

    public DownloadDialog(Context context) {
        super(context);
        setTitle(context.getResources().getString(R.string.progress_dialog_title));
        setIcon(context.getResources().getDrawable(android.R.drawable.stat_sys_download));
        setMessage(context.getResources().getString(R.string.fetching_questions));
        setCanceledOnTouchOutside(false);
    }

}
