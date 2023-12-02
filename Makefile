full:
	make build
	make run

build: 
	cd "$(shell pwd)/src/main/java"  && javac Main.java

run: 
	cd "$(shell pwd)/src/main/java" && java Main

clean:
	rm src/main/java/*.class