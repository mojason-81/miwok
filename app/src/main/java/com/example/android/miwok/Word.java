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
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in the language of the user (eg English).
     *
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param imageResourceId is the drawable resource id of the related image.
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in the language of the user (eg English).
     *
     * @param miwokTranslation is the word in the Miwok language
     *
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

    // Get the Image resource ID
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
