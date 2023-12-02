full:
	make build
	make run

build: 
	mvn clean package

run: 
	java -jar ./Target/Urna.jar

clean:
	rm src/main/java/*.class

unit_test:
	mvn unitTest

