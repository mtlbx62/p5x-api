# Projet R3-03 (Sprint 1)

API REST développé à l'aide du fichier Spring Boot permet de gérer les personnages de l'univers de **Personna 5 Phantom X**.

## Réaliser par **Marouan TALBI - BUT2 TPD TD2 (Username : mtlbx62)**

## Technologie auquel j'ai pu utilisées afin de réaliser le API : 
* **Java** et **Fichier SpringBoot donné auprès de Monsieur Vitse**
* **Spring Data JPA (Hibernate)**
* **PostgreSQL** et **Docker Desktop**
* **Maven**
* *OS utilisé* : **Windows 11**

## Architecture du projet
Le projet met en avant une architecture de 4 fichiers suivant tel que : 
* `model/` : Entité JPA `Character.java`
* `repository/` : Interface `CharacterRepository.java` pour accès au données.
* `service/` : Classe `CharacterService.java` pour la logique métier.
* `controller/` : Classe `CharacterController.java` pour le endpoints REST.

Le projet doit se mettre en avant sur les connaissances dédiée au Endpoints de l'API qui se nomme le CRUD : 

* POST : `/api/characters` permet d'ajouter un personnage.
* GET : `/api/characters` permet de lister tous les personnages dans le jeu.
* GET : `/api/characters/{id}` permet d'obtenir un personnage par son ID.
* PUT : `/api/characters/{id}` permet de modifier un personnage.
* DELETE : `/api/characters/{id}` qui permet de supprimer un personnage.

## Commande du Lancement de l'application

1. **Démarrer la base de données :**
``bash
docker-compose up -d

2. **Lancer le serveur Spring-Boot :**

``bash
mvn spring-boot:run
