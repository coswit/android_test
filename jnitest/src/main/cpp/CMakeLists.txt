cmake_minimum_required(VERSION 3.4.1)

add_library(test_jni SHARED test_jni.cpp)

#target_link_libraries(test_jni android log)