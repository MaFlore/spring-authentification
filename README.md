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

- `POST /api/role/save` : Crée un nouveau rôle.

  ![1](https://github.com/MaFlore/spring-authentification/assets/101883211/3b070d20-6952-41fa-b280-a48db19e0c68)

- `GET /api/role/{nom}` : Récupère les détails d'un rôle à partir de son nom.

  ![2](https://github.com/MaFlore/spring-authentification/assets/101883211/7fff163a-2f7f-4cdb-a143-706ddc44a910)

- `GET /api/roles`  : Récupère la liste des rôles.

  ![3](https://github.com/MaFlore/spring-authentification/assets/101883211/9aeaff0a-f275-4e27-b39a-e41b6410174d)

- `POST /apiuser/save` : Crée un nouvel utilisateur.

  ![4](https://github.com/MaFlore/spring-authentification/assets/101883211/93485826-26fb-4ff7-9fc3-66be0de3c456)

- `GET /api/users` : Recupère la liste des utilisateus.

  ![5](https://github.com/MaFlore/spring-authentification/assets/101883211/6087853a-201d-416d-96ee-f4cf730d3c01)

- `POST /api/login` : Connecte un utilisateur à l'api à partir du `username` et du `password` de ce dernier et renvoie ensuite un `access_token` pour accéder à l'application et `refresh_token` pour rafraîchir l'`access_token`.

  ![6](https://github.com/MaFlore/spring-authentification/assets/101883211/452f4b67-bb59-47fa-96b3-c62ad8fbb672)

- `POST /api/role/add-to-user` : Ajoute un rôle à un utilisateur à partir de son `username` et le `nom du rôle`.

  ![7](https://github.com/MaFlore/spring-authentification/assets/101883211/fb394504-8ad0-47bd-b42f-08a257b3904f)

- `GET /api/user/info` : Recupère les informations d'un utilisateur à partir d'un `access_token`.

  ![Capture d’écran 2023-07-15 005952](https://github.com/MaFlore/spring-authentification/assets/101883211/b74942d4-7752-4dec-8701-e1393f9902b5)

- `GET /api/refresh-token` : Raffraîchit l'`access_token` à partir d'un `refresh_token`.

  ![Capture d’écran 2023-07-15 013302](https://github.com/MaFlore/spring-authentification/assets/101883211/8ec78beb-4856-48b7-af0f-a761f9717252)

## Merci !!😍😍😍
N'hésitez pas à modifier cette documentation selon les besoins de votre projet.
