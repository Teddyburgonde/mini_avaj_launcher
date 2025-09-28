# 🛫 Avaj Launcher — Plan de migration mini → version finale

## 📂 Structure du projet

```c
src/
└── avaj/
├── aircraft/
│ ├── Aircraft.java
│ ├── JetPlane.java
│ ├── Balloon.java
│ ├── Helicopter.java
│ └── AircraftFactory.java
│
└── simulator/
├── Simulator.java
├── WeatherProvider.java
├── WeatherTower.java
└── Logger.java
```

---

## 📝 Étapes


---

## 📝 Étapes

### 1 — Mise en place
- ✅ Créer les packages `avaj.aircraft` et `avaj.simulator`.
- ✅ Ajouter `package` en haut de chaque fichier.
- ✅ Vérifier que tout compile avec `javac -d .`.

---

### 2 — Classes de base
- ✅ Créer `Aircraft` (classe abstraite avec name, longitude, latitude, height).
- ✅ Créer `JetPlane`.
- ✅ Créer `Balloon`.
- ❌ Créer `Helicopter`.

---

### 3 — Factory
- ✅ Créer `AircraftFactory` avec `newAircraft(type, name, long, lat, height)`.
- ❌ Ajouter le type `Helicopter`.
- ❌ Supprimer les `System.out.println` (pas autorisés).

---

### 4 — Météo (Singleton)
- ❌ Transformer `WeatherProvider` en **Singleton**.
- ❌ Modifier `getCurrentWeather` pour prendre des `Coordinates`.

---

### 5 — Tour météo (Observer)
- ❌ Ajouter une liste `observers` dans `WeatherTower`.
- ❌ Ajouter `register(Aircraft a)` et `unregister(Aircraft a)`.
- ❌ Modifier `changeWeather()` pour notifier tous les avions enregistrés.

---

### 6 — Logger (fichier simulation.txt)
- ❌ Créer `Logger.java`.
- ❌ Remplacer tous les `System.out.println` par `Logger.log(...)`.

---

### 7 — Règles météo
- ❌ Implémenter les règles météo officielles pour :
  - JetPlane
  - Balloon
  - Helicopter
- ❌ Gérer la hauteur (0–100).
- ❌ Si `height <= 0` → log un atterrissage + `unregister`.

---

### 8 — Simulation finale
- ✅ Lire `scenario.txt` depuis `Simulator`.
- ✅ Récupérer le nombre de cycles.
- ✅ Créer les avions via la Factory.
- ❌ Enregistrer les avions dans `WeatherTower` (`register`).
- ❌ Boucler `cycles` fois en appelant `tower.changeWeather()`.

---

### 9 — Validation & Tests
- ❌ Créer plusieurs scénarios de test.
- ❌ Vérifier le contenu de `simulation.txt`.
- ❌ Vérifier l’atterrissage et le désenregistrement.
- ❌ Vérifier que toutes les règles météo sont respectées.

---

## 📊 Checklist finale
- ❌ Plus de `System.out.println`.
- ❌ `WeatherProvider` est Singleton.
- ❌ `WeatherTower` est Observer.
- ❌ Tous les avions suivent les règles météo.
- ❌ Logger vers `simulation.txt`.
- ❌ Atterrissages gérés correctement.

---


✅  ❌ 


## 🧾 Commandes utiles (compilation & exécution)

Depuis `src/` (racine contenant `avaj/`) :

## ✔️ Checklist finale (avant rendu)
- [ ] Tous les fichiers ont un `package` correct.
- [ ] `WeatherProvider` est singleton.
- [ ] `WeatherTower` gère Observer (register/unregister).
- [ ] `updateWeather` des avions modifie réellement les coordonnées.
- [ ] Tous les logs écrits dans `simulation.txt`.
- [ ] Validation robuste du fichier d’entrée.
- [ ] Pas de `System.out.println` inutiles (sauf debug commenté).
