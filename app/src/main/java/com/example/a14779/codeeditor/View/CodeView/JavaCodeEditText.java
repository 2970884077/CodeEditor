package com.example.a14779.codeeditor.View.CodeView;

import android.content.Context;
import android.text.Editable;

import java.util.regex.Pattern;

/**
 * Created by liangtao on 18-1-22.
 */

public class JavaCodeEditText extends AbsCodeEditText {

    public static Pattern JAVA_KEY_WORD = Pattern.compile("\\b(" +
            "public|protected|private|class|extends|abstract|" +
            "interface" +
            ")\\b");

    public static Pattern JAVA_DATA_TYPE = Pattern.compile("\\b(" +
            "boolen|char|double|Editable|float|HashMap" +
            "|int|List|Map|String" +
            ")\\b");

    public JavaCodeEditText(Context context) {
        super(context);
    }

    @Override
    public void highLight(Editable editable) {

    }

    @Override
    public void autoIndent(Editable editable, int type) {

    }

}
