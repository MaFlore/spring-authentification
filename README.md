# spring-authentification
Une petite hostilité pour gérer les utilisateurs, leurs rôles ainsi que leur accès à partir d'un token et le rafraîchissement de ce dernier.

## Contenu du projet
Le projet comprend les classes suivantes :

- **User** : Cette classe représente un utilisateur de l'application. Elle est annotée avec `@Entity` pour la persistance en base de données. Les principales propriétés de l'utilisateur incluent son nom, prénom, nom d'utilisateur et mot de passe. La classe utilise également une relation Many-to-Many avec la classe `Role` pour gérer les rôles associés à l'utilisateur.

- **Role** : Cette classe représente un rôle auquel un utilisateur peut être associé. Elle est également annotée avec `@Entity` pour la persistance en base de données. Chaque rôle possède un nom unique.

## Configuration de la base de données
Le projet utilise une base de données relationnelle pour stocker les utilisateurs et les rôles. La configuration de la base de données se trouve dans le fichier `application.properties` ou `application.yml`.

## Utilisation des annotations Lombok
Ce projet utilise le projet Lombok pour générer automatiquement des méthodes telles que les constructeurs, les accesseurs et les mutateurs, afin de réduire la quantité de code boilerplate. Les annotations Lombok utilisées dans ce projet sont `@Data`, `@NoArgsConstructor` et `@AllArgsConstructor`.

## Configuration de la sécurité
La sécurité est gérée en utilisant les fonctionnalités de Spring Security. Des mécanismes d'authentification et d'autorisation sont mis en place pour contrôler l'accès aux ressources de l'application en fonction des rôles des utilisateurs.

## Installation et exécution
Clonez ce dépôt sur votre machine locale.
Assurez-vous que vous avez une base de données configurée et que les détails de connexion sont corrects dans le fichier `application.properties` ou `application.yml`.
Compilez et exécutez le projet à l'aide de votre IDE préféré ou en utilisant la commande `./mvnw spring-boot:run`.
Accédez à l'application via l'URL http://localhost:9002.

## Points d'entrée de l'API
Le projet expose plusieurs points d'entrée d'API pour la gestion des utilisateurs et des rôles.


## Auteurs
**AHADJITSE Yawo Florent Mathis**
**Développeur Full Stack**
**Copyright 2023**

N'hésitez pas à modifier cette documentation selon les besoins de votre projet.