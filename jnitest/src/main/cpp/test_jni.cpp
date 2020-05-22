#include <string.h>
#include <jni.h>

extern "C"
JNIEXPORT jstring JNICALL
Java_xyz_coswit_jnitest_MainActivity_stringFromJNI(JNIEnv *env, jobject thiz, jstring to) {
    return (*env).NewStringUTF("数据");
}

