
# Exercice 2 : programme sur les conditions

Cette petite application Java permet de récupérer un nombre entier (soit en argument de la ligne de commande, soit saisi au clavier), puis d’indiquer s’il est **négatif, positif ou nul** et s’il est **pair ou impair**.

## Sommaire
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Règles-du-jeu](#règles-du-jeu)
- [Fonctionnalités](#fonctionnalités)
- [Structure du code](#structure-du-code)

## Installation

1. **Prérequis** : avoir le **JDK** (Java Development Kit) installé (version 8+).
2. Téléchargez le fichier `Test.java`.
3. Compilez le programme :

   ```bash
   javac Test.java
   ```

4. Exécutez ensuite :

   ```bash
   java Test
   ```

   ou avec un entier en argument :

   ```bash
   java Test 42
   ```

## Utilisation

L’application peut fonctionner **de deux façons** :

### 1. Avec un argument en ligne de commande

```bash
java Test -5
```

 Le programme analyse directement `-5` et affiche :

  ```text
  -5 est négatif
  -5 est impair
  ```

### 2. Sans argument (mode interactif)

1. Lancez :

   ```bash
   java Test
   ```
2. Le programme affiche :

   ```text
   Entrez un nombre
   ```
3. Si vous tapez autre chose qu’un entier (`abc`, `12.5`, etc.), il redemandera :

   ```text
   Entrée invalide, veuillez entrer un entier :
   ```
4. Une fois un entier saisi, il affiche :

   * s’il est **négatif / positif / nul**
   * s’il est **pair / impair**

Exemples :

```text
0 est nul
0 est pair
```

```text
13 est positif
13 est impair
```

## Règles du jeu

Même si ce n’est pas vraiment un jeu, on peut considérer ces règles :

1. Si **un entier est fourni en argument**, il est utilisé en priorité.
2. Sinon, le programme **passe en mode saisie utilisateur**.
3. Tant que l’utilisateur **n’entre pas un entier valide**, le programme redemande une saisie.
4. Le programme **teste deux choses** :

   * le **signe** (négatif / positif / nul)
   * la **parité** (pair / impair)
5. Le programme s’arrête après avoir affiché les deux résultats.

## Fonctionnalités

* ✅ Lecture d’un entier **depuis les arguments** de la ligne de commande
* ✅ **Fallback** vers une saisie clavier si aucun argument n’est donné
* ✅ **Validation** de la saisie utilisateur (boucle jusqu’à obtenir un entier)
* ✅ Détermination du **signe** :

  * `< 0` → “est négatif”
  * `> 0` → “est positif”
  * `== 0` → “est nul”
* ✅ Détermination de la **parité** :

  * `% 2 == 0` → “est pair”
  * sinon → “est impair”
* ✅ Messages clairs en français
* 🧩 Code facilement extensible (bornes, intervalles, catégories, etc.)

## Structure du code

* **Classe principale :** `Test`

  * Contient la méthode `public static void main(String[] args)` : point d’entrée.

* **Imports :**

  * `import java.util.Scanner;` : utilisé seulement si aucun argument n’est fourni.

* **Parties principales :**

  1. **Récupération de l’entier**

     * `if (args.length > 0)` : on prend `args[0]` et on le convertit en entier via `Integer.parseInt(...)`
     * `else` : on crée un `Scanner` pour lire au clavier

       * on affiche “Entrez un nombre”
       * on vérifie avec `scan.hasNextInt()` que l’entrée est bien un entier
       * sinon, on redemande
  2. **Analyse du signe**

     * `if (integerInt < 0)` → négatif
     * `else if (integerInt > 0)` → positif
     * `else` → nul
  3. **Analyse de la parité**

     * `if (integerInt % 2 == 0)` → pair
     * `else` → impair

