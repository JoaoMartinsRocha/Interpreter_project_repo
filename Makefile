
all: genAst
	javac lox/*.java 

run:
	java lox.Lox

genAst: tool/GenerateAst.class
	java tool.GenerateAst /Users/jprocha/Desktop/Interpreter_project/lox/
	
tool/GenerateAst.class: tool/GenerateAst.java
	javac tool/GenerateAst.java