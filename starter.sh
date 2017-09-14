#!/bin/zsh

if [ -e Main.scala ]; then
	NAME=$(echo ${PWD:t} | LANG=C sed 's/[^a-zA-Z0-9]//g')
	sed -i "s/xNAMEx/${NAME}/g" build.sbt
	sed -i "s/xNAMEx/${NAME}/g" Main.scala
	mkdir -p src/main/scala/org/felher/$NAME/
	mv Main.scala src/main/scala/org/felher/$NAME/
fi

tmux new "zsh -is eval TERM=rxvt-unicode-256color vim" ";" new-window "zsh -is eval SBT_OPTS=\'-Xms512M -Xmx1024M -Xss4M -XX:MaxMetaspaceSize=1024M\' sbt"
