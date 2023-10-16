# Esercizio con Git, in locale

Per ogni passo,
si annoti in questo file il comando utilizzato ed il suo output,
per confrontarlo con le soluzioni.

### Si crei una nuova directory
mkdir test
cd test/

### Si inizializzi un repository Git dentro la cartella suddetta.
git init

### Si osservi lo stato del repository
git status

### Si scriva un file `HelloWorld.java` contenente un `main` con una stampa a video e si osservi il contenuto del repository
touch HelloWorld.java
vi HelloWorld.java
...
ls -a

### Si aggiunga `HelloWorld.java` allo stage, e si osservi lo stato del repository
git add HelloWorld.java
git status

### Si crei il primo commit, con messaggio ragionevole. Se necessario, si configuri nome utente ed email di git usando i dati dell'account istituzionale.
git commit -m "Hello world file for git test"
git config --global user.name "Andrew Gagliotti"
git config --global user.email "stocazzochelascrivo@fottiti.com"

### Si compili il file Java e si verifichi lo stato del repository
javac bin/HelloWorld.java
java bin/HelloWorld

### Si noti che c'è un file rigenerabile (`HelloWorld.class`). Si costruisca una lista di file ignorati che ignori tutti i file con estensione `.class`
touch .gitignore
vi .gitignore
...

### Si osservi lo stato del repository
git status

### Si crei un nuovo commit che tracci il la ignore list, aggiungendo allo stage i file necessari. Si osservi sempre lo stato del repository dopo l'esecuzione di un comando
git add .gitignore
git status
git commit -m "Added .gitignore"
git status

### Si gestiscano i caratteri di fine linea in modo appropriato, creando un file `.gitattributes`
vi .gitattributes
...
`* text=auto eol=lf`
`*.[cC][mM][dD] text eol=crlf`
`*.[bB][aA][tT] text eol=crlf`
`*.[pP][sS]1 text eol=crlf`

### Si osservi la storia del repository usando `git log --all --graph`
git log --all --graph

### Da questo punto in poi, prima e dopo ogni comando, ci si assicuri di osservare lo stato del repository con `git status`
ok

### Si crei un file Mistake.java, con contenuto arbitrario, lo si aggiunga al tracker, e si faccia un commit
touch Mistake.java
git status
git add Mistake.java
git status
git commit -m "this was a mistake"
git status
ls -a

### Si rinomini `Mistake.java` in `ToDelete.java`, e si faccia un commit che registra la modifica
mv Mistake.java ToDelete.java
git status
git add Mistake.java ToDelete.java
git status
git commit -m "renamed MIstake.java to ToDelete.java"
git status
ls -a

### Si elimini `ToDelete.java` e si registri la modifica in un commit
rm ToDelete.java
git status
git add ToDelete.java
git status
git commit -m "deleted ToDelete.java"
git status
ls -a

### Si osservi la storia del repository e si identifichi il commit dove è stato creato `Mistake.java`. Per una visione compatta, si usi l'opzione `--oneline`
git log --all --graph --oneline

### Si ripristini Mistake.java dal commit identificato al passo precedente
git checkout b4edf75
git status

### Si rimuova il file ripristinato e si ripulisca lo stage
rm Mistake.java
git status
git add Mistake.java
git status
git commit -m "removed Mistake.java"
git status
git reset HEAD Mistake.java
git status

### Si torni al commit precedente a quello in cui `Mistake.java` è stato creato. Si utilizzi la storia del repository se utile.
git checkout 2e2b3f5
git status
git log --all --graph --oneline

