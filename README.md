# Exercice 1 d'introduction à java

Cette application Java très simple permet d’accueillir un utilisateur dans la console, de lui demander son nom et son prénom, puis d’afficher un message de bienvenue personnalisé.

## Installation

1. Assurez-vous d’avoir **Java (JDK)** installé (version 8 ou supérieure).
2. Créez un fichier nommé `Hello.java`.
3. Collez le code suivant dans le fichier :

   ```java
   import java.util.Scanner;

   public class Hello {
       public static void main(String[] args) {
           System.out.println("Bonjour et bienvenue dans mon programme java");

           Scanner scan = new Scanner(System.in);
           System.out.println("Entrez votre nom");
           String name = scan.nextLine();
           System.out.println("Entrez votre prénom");
           String firstname = scan.nextLine();
           System.out.println("Bienvenue " + firstname + " " + name);
       }
   }


4. Compilez le programme depuis un terminal à l’emplacement du fichier :

   ```bash
   javac Hello.java
   ```

5. Lancez le programme :

   ```bash
   java Hello
   ```

## Utilisation

1. Exécutez la commande `java Hello`.
2. Le programme affiche :

   * **"Bonjour et bienvenue dans mon programme java"**
   * puis **"Entrez votre nom"** → saisissez par exemple `Dupont`
   * puis **"Entrez votre prénom"** → saisissez par exemple `Marie`
3. Le programme affiche alors :

   ```text
   Bienvenue Marie Dupont
   ```


## Fonctionnalités

* ✅ Affichage d’un **message d’accueil** au démarrage
* ✅ Saisie **interactive** via la console
* ✅ Demande du **nom** de l’utilisateur
* ✅ Demande du **prénom** de l’utilisateur
* ✅ Affichage d’un **message personnalisé** : `Bienvenue <prénom> <nom>`

## Structure du code

* **Classe principale :** `Hello`

  * Contient la méthode `public static void main(String[] args)` : point d’entrée du programme.
* **Imports :**

  * `import java.util.Scanner;` : permet de lire ce que l’utilisateur tape au clavier.
* **Étapes dans `main` :**

  1. Afficher un message d’accueil.
  2. Créer un objet `Scanner` pour lire la saisie utilisateur.
  3. Demander et lire le **nom** (`name`).
  4. Demander et lire le **prénom** (`firstname`).
  5. Afficher : `Bienvenue <prénom> <nom>`.

