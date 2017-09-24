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
    private int mVoiceResourceId = NO_AUDIO_PROVIDED;

    private static final int NO_AUDIO_PROVIDED = -1;

    public static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in the language of the user (eg English).
     *
     * @param miwokTranslation is the word in the Miwok language.
     *
     * @param imageResourceId is the drawable resource id of the related image.
     *
     * @param voiceResourceId is the resource if of the related audio file.
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int voiceResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mVoiceResourceId = voiceResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in the language of the user (eg English).
     *
     * @param miwokTranslation is the word in the Miwok language
     *
     * @param voiceResourceId is the drawable resource id of the related image.
     *
     */
    public Word(String defaultTranslation, String miwokTranslation, int voiceResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mVoiceResourceId = voiceResourceId;
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

    // Get the Audio resource ID
    public int getVoiceResourceId() {
        return mVoiceResourceId;
    }


    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mVoiceResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
