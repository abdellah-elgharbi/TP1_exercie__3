# TP1_exercie__3
Voici une description pour le fichier `README.md` de votre application mobile qui permet de récupérer les réponses des utilisateurs et de naviguer vers un autre écran pour afficher les résultats :

---

# **Application de Saisie et d'Affichage des Résultats**

## **Description**

Cette application mobile simple permet aux utilisateurs de saisir des données dans un champ de texte, puis de les visualiser sur un autre écran en appuyant sur un bouton. Elle inclut également la possibilité de quitter l'application directement depuis l'interface principale.

### **Fonctionnalités principales :**

1. **Saisie de texte :**
   - L'utilisateur peut entrer des informations dans un champ de texte (par exemple, un nom ou un message) sur l'écran principal.

2. **Navigation vers un autre écran :**
   - En cliquant sur le bouton **"Suivant"**, l'utilisateur est redirigé vers une nouvelle activité où le texte qu'il a saisi est affiché dans un `TextView`.
   - L'application utilise une **Intent** pour transmettre les données saisies d'une activité à une autre.

3. **Quitter l'application :**
   - Un bouton **"Quitter"** est également présent sur l'écran principal. En cliquant dessus, l'utilisateur peut fermer l'application en terminant l'activité en cours.

---

## **Résumé technique**

1. **Interface utilisateur (XML) :**
   - L'interface est construite à l'aide d'un **ConstraintLayout**, qui permet de placer les éléments (champs de texte et boutons) de manière fluide et adaptable à différentes tailles d'écrans.

2. **Code Java :**
   - Le bouton **"Suivant"** utilise un **Intent** pour transmettre le texte saisi à une nouvelle activité, où il est affiché dans un `TextView`.
   - Le bouton **"Quitter"** utilise la méthode **`finish()`** pour fermer l'activité en cours et quitter l'application.

---

## **Cas d'utilisation**

1. **Inscription ou saisie de données :**
   - L'application peut être utilisée pour diverses situations nécessitant la saisie de texte, comme la collecte d'informations utilisateur (inscriptions, messages, questionnaires).

2. **Apprentissage Android :**
   - C'est un excellent exercice pour comprendre les concepts de base d'Android, notamment la gestion des **activités**, la navigation entre elles, et l'utilisation d'**Intents** pour passer des données.

---

## **Installation**

1. Clonez le dépôt GitHub :
   ```bash
   git clone https://github.com/abdellah-elgharbi/TP1_exercie__3.git
   ```

2. Ouvrez le projet dans **Android Studio**.

3. Compilez et lancez l'application sur un émulateur ou un appareil Android.

---

## **Exécution**

1. Entrez du texte dans le champ prévu à cet effet.
2. Appuyez sur **"Suivant"** pour passer à l'écran de récapitulatif.
3. Appuyez sur **"Quitter"** pour fermer l'application.

---

## **Prérequis**

- **Android Studio**
- **JDK 8** ou plus récent
- Un appareil Android ou un émulateur pour tester l'application

---

## **Contributions**

Les contributions sont ouvertes. Si vous avez des idées d'améliorations ou des suggestions, n'hésitez pas à soumettre une **issue** ou une **pull request**.

---

## **Auteur**

Développé par **El gharbi abdellah** dans le cadre d'un exercice de développement d'applications Android.

---

## **Licence**

Ce projet est sous licence **MIT**. Voir le fichier `LICENSE` pour plus de détails.

---

Cela fournira une documentation claire pour toute personne souhaitant comprendre, installer et utiliser l'application.


 
[Screen_recording_20240928_175802.webm](https://github.com/user-attachments/assets/f60582bb-d1e1-44c1-a1d1-d43be3c81352)
