
## Arborescence du Projet

Exploration de l'organisation des fichiers et répertoires dans le projet.

```
code3adresses/                         #  Dossier contenant le code 3 adresses du projet
|-- Assigment.java                     # Classe représentant une affectation
|-- ASTNode.java                       #  Classe de base pour les nœuds de l'arbre syntaxique abstrait (AST)
|-- BinaryOperation.java               # Classe représentant une opération binaire dans l'AST
|-- Main3Adresses.java                 # Point d'entrée du code 3 adresses du compilateur
|-- Symbol.java                        #  Classe représentant un symbole d
|-- ThreeAddressCodeGenerator.java     # Générateur de code 3 adresses
|-- WhileLoop.java                     # Classe représentant une boucle "while" dans l'AST

myantlr/                       # Dossier regroupant les fichiers liés à ANTLR
|-- __Test___input.txt         # Fichier de test pour ANTLR
|-- AST.java                   # Interface pour définir l'AST
|-- Projet_While.g             # Grammaire ANTLR pour le langage du projet
|-- Projet_While.tokens        # Fichier contenant les tokens générés par ANTLR
|-- Projet_WhileLexer.java     # Classe du lexer générée par ANTLR
|-- Projet_WhileParser.java    # Classe du parser générée par ANTLR

tableSymbole/                  # Dossier regroupant les fichiers liés à la table des symboles :
|-- MainTableSymboles          # Point d'entrée de la table des symboles du compilateur
|-- TableSymbole               # Structure de données pour la table des symboles
|-- VisitAST.java              # Le visitor de notre AST 
```


## Utilisation

Bien que le projet ne soit pas encore achevé, 
vous avez la possibilité d'exécuter les fichiers Main présents dans chacun des répertoires.

```
tableSymbole/           
|-- MainTableSymboles
```

```
code3adresses/  
|-- Main3Adresses.java
```

## Contribution

1. Fork le projet : (`https://github.com/Ethanesir/TLC_Projet`)
2. Créez une branche (`git checkout -b meda`)
3. Commit vos modifications (`git commit -m 'Ajout d'une fonctionnalité étonnante'`)
4. Push sur la branche (`git push origin meda`)
5. Ouvrez une Pull Request

## Licence
openSource