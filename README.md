# Calculateur d'Impôts Locaux 

## Description

Cette application Android permet de calculer les impôts locaux  en fonction de certaines caractéristiques. Le calcul prend en compte des éléments comme la surface, le nombre de pièces, et la présence d'une piscine. L'utilisateur entre les informations requises, et l'application calcule automatiquement le montant total des impôts.

## Fonctionnalités

- Entrée des informations sur la propriété telles que :
  - Surface (en m²)
  - Nombre de pièces
  - Présence d'une piscine (oui/non)
- Calcul automatique de l'impôt total basé sur la formule suivante :
  - **Impôt de base** : `surface * 2`
  - **Impôt supplémentaire** : `nombre de pièces * 50 + 100` (si une piscine est présente)
  - **Impôt total** : somme de l'impôt de base et de l'impôt supplémentaire
- Affichage clair et lisible du montant total des impôts.

## Prérequis

- **Android Studio** (version recommandée : 4.0 ou supérieure)
- **JDK 8** ou supérieur
- Un appareil Android ou un émulateur (API 21 ou supérieure)

## Installation

1. **Cloner le dépôt** :
   ```bash
   git clone https://github.com/elmahjoubisouka/exo2_tp1.git
## Demonstration
https://github.com/user-attachments/assets/7f77d48b-51f5-4f66-aed8-70d6b9f48ede
