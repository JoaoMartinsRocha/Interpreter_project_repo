
all: genAst
	javac lox/*.java 

run:
	java lox.Lox

genAst: tool/GenerateAst.class
	java tool.GenerateAst /Users/jprocha/Desktop/Interpreter_project_repo/lox/
	
tool/GenerateAst.class: tool/GenerateAst.java
	javac tool/GenerateAst.java

clean:
	find . -name "*.class" -type f -delete