#include <string.h>
#include <jni.h>
#include <string>

using std::string;

extern "C"
JNIEXPORT jstring JNICALL
Java_xyz_coswit_jnitest_MainActivity_stringFromJNI(JNIEnv *env, jobject thiz, jstring to) {
    const char *str;
    jboolean  jb;
    str = env->GetStringUTFChars(to,&jb);

    string s1 = string("jni修改后数据：");
    s1 = s1 + str;

    const char *temp = s1.c_str();
    jstring jst = env->NewStringUTF(temp);
    return jst;
}

