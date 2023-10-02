# Compilazione da cartella padre
javac -sourcepath 01-analysis-method-scope-with-multifile-compilation/ 01-analysis-method-scope-with-multifile-compilation/TestScopesMain.java

# Esecuzione da cartella padre
java 01-analysis-method-scope-with-multifile-compilation/TestScopesMain

# Compilare un file java e posizionarlo in una cartella separata: si creano sottocartelle in base alla dichiarazione del package
javac -d bin/ src/NomeFile.java

# Passare a java dei percorsi con file .class
java -cp "bin\;home/pippo/*/pluto/paperino\;" NomeClasse

# Passare a java dei percorsi con file .class ma con nome simbolico del package
java -cp "bin\;home/pippo/*/pluto/paperino\;$HOME/percorso1/percorso2/bin/" nome.package.NomeClasse
java -cp 22-compilation-classpath/bin/ compilation.lab.math.UseComplex

# Passare un classpath a javac
javac -cp 21-compilation-with-packages/bin/ -d 22-compilation-classpath/bin/ 22-compilation-classpath/src/compilation/lab/math/UseComplex.java


