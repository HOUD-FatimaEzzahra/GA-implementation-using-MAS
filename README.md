# GA-implementation-using-MAS 
## Description
Ce projet vise à résoudre le problème de trouver une phrase spécifique en utilisant des agents multi-agents et des algorithmes génétiques. L'objectif est de déterminer quel agent est capable de trouver la phrase donnée en premier parmi un groupe d'agents concurrents. L'utilisation d'algorithmes génétiques permet d'explorer efficacement l'espace de recherche et de trouver des solutions optimales. Les agents travaillent de manière parallèle et communiquent entre eux pour échanger des informations sur les solutions trouvées. Cette approche permet d'optimiser la recherche de la phrase cible et de déterminer rapidement l'agent gagnant.

## Solution proposée
Pour résoudre ce problème, nous avons développé un système multi-agents basé sur des algorithmes génétiques. Chaque agent exécute une instance indépendante de l'algorithme génétique, générant ainsi une population d'individus qui évolue au fil des générations. Les agents travaillent en parallèle, exploitant les capacités de traitement parallèle des processeurs multicœurs. Lorsqu'un agent trouve la phrase cible, il envoie un message au système central pour signaler sa réussite. Le système central vérifie ensuite les messages reçus et identifie l'agent gagnant, qui est celui ayant trouvé la phrase cible en premier. Cette approche permet d'accélérer la recherche de la solution et de déterminer rapidement quel agent est le plus performant pour résoudre le problème.


![archi](https://github.com/HOUD-FatimaEzzahra/GA-implementation-using-MAS/blob/main/docs/Capture.PNG)


## Fonctionnalités principales
- Implémentation de l'algorithme génétique avec des systèmes multi-agents.
- Architecture distribuée permettant l'exécution parallèle sur des machines distinctes.
- Mécanisme de migration pour échanger les meilleurs individus et favoriser l'exploration de l'espace de recherche.
- Possibilité de configurer les paramètres de l'algorithme génétique, tels que la taille de la population, les opérateurs génétiques, les critères d'arrêt, etc.
- Fonction d'évaluation pour mesurer la qualité des solutions générées par l'algorithme.

## Ressources supplémentaires
[Algorithmes génétiques parallèles et distribués](https://towardsdatascience.com/parallel-and-distributed-genetic-algorithms-1ed2e76866e3)
