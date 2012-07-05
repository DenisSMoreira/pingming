/* 
 * File:   temperatura.cpp
 * Author: Paulinha
 *
 * Created on 5 de Julho de 2012, 11:53
 */

#include "br_com_medidor_temperatura_jni_RecuperaDadosJNI.h"    
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

JNIEXPORT jint JNICALL Java_br_com_medidor_temperatura_jni_RecuperaDadosJNI_temperatura 
(JNIEnv *env, jobject obj)  
{  
   srand ( time(NULL) );
    return rand()%40+3; 
}  

