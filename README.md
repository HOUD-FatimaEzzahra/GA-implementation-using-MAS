# GA-implementation-using-MAS 
Ce projet propose une solution d'optimisation basée sur l'algorithme génétique avec des systèmes multi-agents. L'objectif est de résoudre un problème complexe d'optimisation en utilisant une approche évolutive inspirée du concept de l'évolution biologique.

## Solution proposée
Nous avons choisi d'utiliser l'algorithme génétique, une technique d'optimisation basée sur les principes de l'évolution naturelle, pour résoudre ce problème. En utilisant des systèmes multi-agents, nous avons étendu l'algorithme génétique pour permettre une résolution parallèle et distribuée, ce qui améliore les performances et la capacité de recherche de solutions optimales.

Notre approche consiste à créer plusieurs instances d'algorithmes génétiques indépendants, appelés "îles", qui travaillent en parallèle sur différentes sous-populations de solutions. Chaque île exécute son propre algorithme génétique, avec des paramètres et des opérateurs génétiques spécifiques, ce qui permet d'introduire de la diversité et d'explorer davantage l'espace des solutions.

Les îles communiquent entre elles périodiquement, échangeant les meilleurs individus afin de partager les connaissances et d'explorer de nouvelles régions de l'espace de recherche. Ce processus de migration favorise l'émergence de solutions optimales en évitant les convergences prématurées vers des optima locaux.


![archi](https://github.com/HOUD-FatimaEzzahra/GA-implementation-using-MAS/blob/main/docs/Capture.PNG)


## Fonctionnalités principales
- Implémentation de l'algorithme génétique avec des systèmes multi-agents.
- Architecture distribuée permettant l'exécution parallèle sur des machines distinctes.
- Mécanisme de migration pour échanger les meilleurs individus entre les îles et favoriser l'exploration de l'espace de recherche.
- Possibilité de configurer les paramètres de l'algorithme génétique, tels que la taille de la population, les opérateurs génétiques, les critères d'arrêt, etc.
- Fonction d'évaluation pour mesurer la qualité des solutions générées par l'algorithme.

## Ressources supplémentaires
[Algorithmes génétiques parallèles et distribués](https://towardsdatascience.com/parallel-and-distributed-genetic-algorithms-1ed2e76866e3)
