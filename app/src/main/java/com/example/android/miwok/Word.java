package com.example.android.miwok;

/**
 * Created by jason on 5/12/17.
 * {@link Word} represents a vocabulary word tehat the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {
    // String values
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    /**
     * Constructs a new Word with initial values for Miwok and Default translations.
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Get the Default translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
