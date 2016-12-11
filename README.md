# Java-EE

Megdoud Mohamed - Xu Xiaofan

Lancer le projet puis aller à : http://localhost:8080/

Fonctionnalité faite :

- Création/Manipulation du profil utilisateur(email/id facebook/photo...)
- Micro-Blogging : Post de messages
- Gestion des hashtags et affichage des messages par utilisateur et hashtag
- API de web services (gestion utilisateur/post et lecture de messages)
- Recherche de messages/utilisateurs/hashtags

exemple de commande :

deux profils dejà crées :

1) name = "Jean" password = "1"
2) name = "Bob" password = "2"

GET :

http://localhost:8080/     -> retourne l'index de lapplication avec dedans tous les messages

http://localhost:8080/index    -> retourne l'index de lapplication avec dedans tous les messages

http://localhost:8080/login    -> retourne la page de login pour se connecter


POST :

http://localhost:8080/login?name=Jean&password=1&action=login   ->  se connect avec le profil de Jean

http://localhost:8080/login?name=Bob&password=2&action=login   ->  se connect avec le profil de Bob

http://localhost:8080/login?name=Alice&password=3&action=signIn   ->  s'enregistrer en tant qu'Alice

http://localhost:8080/postMessage?userName=Bob&message=Salut   ->  post message "Salut" par Bob

http://localhost:8080/postMessage?userName=Bob&message=@Jean Salut %23bonjour -> post message "Salut" à @Jean avec hashTag #bonjour

http://localhost:8080/profile?username=Bob    ->  voir le profile de Bob

http://localhost:8080/profile?username=blabla   -> renvoi que l'utilisateur n'existe pas  

http://localhost:8080/hashTag?hashTag=%23vador  -> renvoi tous les messages contenant le hashTag #vador

http://localhost:8080/edit_profile?username=Bob  ->  renvoi la page pour editer le profile de Bob

http://localhost:8080/edit_profile?username=blabla  ->  renvoi que l'utilisateur n'existe pas 

http://localhost:8080/save_edit_profile?username=Bob&email=bob@hotmail.fr&facebook=bobfb&twitter=bobtw&linkedIn=bobli    ->   edite le profil de Bob et sauvegarde les parametres facebook, twitter ....




