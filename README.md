# 🛫 Mini Avaj Launcher — Projet pédagogique

Ce projet est une **version simplifiée** d’Avaj Launcher pour apprendre les bases avant d’attaquer le vrai projet.  
Il permet de pratiquer la **POO en Java**, la **lecture de fichiers**, et le **Factory Pattern**.

---

## 🎯 Objectif
Créer une petite simulation où :
- On lit un fichier `scenario.txt` qui décrit des avions.
- On crée ces avions avec une **factory**.
- On simule plusieurs cycles météo.
- Chaque avion réagit à la météo en affichant un message.

---

## 📂 Structure du projet

```c
src/
└── avaj/
├── Simulator.java // Point d’entrée
├── Aircraft.java // Classe abstraite
├── JetPlane.java // Sous-classe
├── Balloon.java // Sous-classe
├── AircraftFactory.java // Factory
├── WeatherProvider.java // Générateur météo
└── WeatherTower.java // Notifie les avions
```

---

## 📝 Étapes à suivre

### 1. Mise en place
- ❌ Créer le dossier `src/avaj/`.
- ❌ Ajouter un fichier `README.md` (celui-ci).
- ❌ Préparer le fichier `scenario.txt`.

---

### 2. Classes de base
- ❌ Créer la classe abstraite `Aircraft` avec :
  - attributs communs : name, longitude, latitude, height.
  - un constructeur.
  - une méthode abstraite `updateWeather(String weather)`.
- ❌ Créer la classe `JetPlane` qui hérite de `Aircraft`.
- ❌ Créer la classe `Balloon` qui hérite de `Aircraft`.
- ❌ Implémenter `updateWeather` dans chaque sous-classe avec des messages simples :
  - `JetPlane`: "JetPlane réagit au [météo]".
  - `Balloon`: "Balloon réagit au [météo]".

---

### 3. Factory
- ❌ Créer `AircraftFactory` avec une méthode statique `newAircraft(type, name, long, lat, height)`.
- ❌ Retourner le bon type d’objet (`JetPlane` ou `Balloon`).
- ❌ Gérer le cas où le type n’existe pas (erreur).

---

### 4. Météo
- ❌ Créer `WeatherProvider` avec une méthode `getCurrentWeather()` qui retourne aléatoirement :
  - `SUN`, `RAIN`, `FOG`, `SNOW`.
- ❌ Ajouter `WeatherTower` qui appelle `getCurrentWeather()` et transmet aux avions.

---

### 5. Simulation
- ❌ Dans `Simulator.java` :
  - Lire `scenario.txt`.
  - Récupérer le nombre de cycles.
  - Créer les avions via la Factory.
  - Boucler sur les cycles :
    - Demander la météo.
    - Chaque avion affiche un message.
- ❌ Afficher les logs dans la **console** (pas besoin de fichier pour ce mini-projet).

---

### 6. Tests
- ❌ Lancer avec un scénario simple :


- ❌ Vérifier que chaque cycle météo affiche bien les messages attendus.

---

## 🚀 Extensions possibles (après)
- Ajouter le **Singleton** pour `WeatherProvider`.
- Ajouter l’**Observer** pour gérer l’enregistrement/désenregistrement.
- Sauvegarder les logs dans `simulation.txt` comme le vrai projet.

---

## ✅ Progression
Chaque tâche que tu termines passe de ❌ à ✅.
