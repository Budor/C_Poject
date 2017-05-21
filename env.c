#include<stdio.h>
#include<stdlib.h>

int main(int argc,char* argv,char** env){
	extern char** environ;
	printf("%p,%p\n",env,environ);
	setenv("PATH","E:\\src",0);
	printf("value = %s\n",getenv("PATH"));
	return 0;
}
