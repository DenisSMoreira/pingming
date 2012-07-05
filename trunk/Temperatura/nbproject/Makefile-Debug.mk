#
# Generated Makefile - do not edit!
#
# Edit the Makefile in the project folder instead (../Makefile). Each target
# has a -pre and a -post target defined where you can add customized code.
#
# This makefile implements configuration specific macros and targets.


# Environment
MKDIR=mkdir
CP=cp
GREP=grep
NM=nm
CCADMIN=CCadmin
RANLIB=ranlib
CC=mingw32-gcc-4.6.2.exe
CCC=mingw32-g++-4.6.2.exe
CXX=mingw32-g++-4.6.2.exe
FC=gfortran
AS=as.exe

# Macros
CND_PLATFORM=MinGW_1-Windows
CND_CONF=Debug
CND_DISTDIR=dist
CND_BUILDDIR=build

# Include project Makefile
include Makefile

# Object Directory
OBJECTDIR=${CND_BUILDDIR}/${CND_CONF}/${CND_PLATFORM}

# Object Files
OBJECTFILES= \
	${OBJECTDIR}/_ext/1152425666/temperatura.o


# C Compiler Flags
CFLAGS=-m64 -shared -m64

# CC Compiler Flags
CCFLAGS=-m64 -shared -m64
CXXFLAGS=-m64 -shared -m64

# Fortran Compiler Flags
FFLAGS=

# Assembler Flags
ASFLAGS=

# Link Libraries and Options
LDLIBSOPTIONS=

# Build Targets
.build-conf: ${BUILD_SUBPROJECTS}
	"${MAKE}"  -f nbproject/Makefile-${CND_CONF}.mk ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/libTemperatura.dll

${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/libTemperatura.dll: ${OBJECTFILES}
	${MKDIR} -p ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}
	mingw32-g++-4.6.2.exe -shared -o ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/libTemperatura.dll ${OBJECTFILES} ${LDLIBSOPTIONS} 

${OBJECTDIR}/_ext/1152425666/temperatura.o: /C/Users/Paulinha/Documents/NetBeansProjects/Temperatura/temperatura.cpp 
	${MKDIR} -p ${OBJECTDIR}/_ext/1152425666
	${RM} $@.d
	$(COMPILE.cc) -g -I/C/Program\ Files/Java/jdk1.7.0/include -I/C/Program\ Files/Java/jdk1.7.0/include/win32  -MMD -MP -MF $@.d -o ${OBJECTDIR}/_ext/1152425666/temperatura.o /C/Users/Paulinha/Documents/NetBeansProjects/Temperatura/temperatura.cpp

# Subprojects
.build-subprojects:

# Clean Targets
.clean-conf: ${CLEAN_SUBPROJECTS}
	${RM} -r ${CND_BUILDDIR}/${CND_CONF}
	${RM} ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/libTemperatura.dll

# Subprojects
.clean-subprojects:

# Enable dependency checking
.dep.inc: .depcheck-impl

include .dep.inc
