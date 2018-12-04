#!/bin/sh

. "$ZOOBINDIR"/env.sh
APP_JAR_NAME="${build.finalName}.jar"

current_path=`pwd`
case "`uname`" in
    Linux)
		bin_abs_path=$(readlink -f $(dirname $0))
		;;
	*)
		bin_abs_path=`cd $(dirname $0); pwd`
		;;
esac

nohup $JAVA_HOME/bin/java -jar $JAVA_OPTS  $APP_JAR_NAME