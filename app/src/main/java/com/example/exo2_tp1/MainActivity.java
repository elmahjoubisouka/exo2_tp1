package com.example.exo2_tp1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextSurface, editTextNombrePieces;
    private CheckBox checkBoxPiscine;
    private Button btnCalcul;
    private TextView textViewResult; // Déclaration de textViewResult

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupération des vues
        editTextSurface = findViewById(R.id.editTextSurface);
        editTextNombrePieces = findViewById(R.id.editNbpièce);
        checkBoxPiscine = findViewById(R.id.checkBoxPiscine);
        btnCalcul = findViewById(R.id.btn_Calcul);
        textViewResult = findViewById(R.id.textViewResult); // Récupération du TextView

        // Ajout d'un écouteur de clic sur le bouton de calcul
        btnCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculerImpot();
            }
        });
    }

    // Méthode pour calculer l'impôt
    private void calculerImpot() {
        try {
            // Récupération de la surface saisie
            String surfaceStr = editTextSurface.getText().toString();
            String piecesStr = editTextNombrePieces.getText().toString();

            // Vérification que les champs ne sont pas vides
            if (surfaceStr.isEmpty() || piecesStr.isEmpty()) {
                Toast.makeText(MainActivity.this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
                return;
            }

            // Conversion des valeurs en nombres
            int surface = Integer.parseInt(surfaceStr);
            int nombrePieces = Integer.parseInt(piecesStr);

            // Calcul de l'impôt de base
            float impotBase = surface * 2;

            // Calcul de l'impôt supplémentaire
            float impotSupplementaire = (nombrePieces * 50) + (checkBoxPiscine.isChecked() ? 100 : 0);

            // Calcul de l'impôt total
            float impotTotal = impotBase + impotSupplementaire;

            // Affichage des résultats
            String message = "Impôt de base : " + impotBase + " \n" +
                    "Impôt supplémentaire : " + impotSupplementaire + " \n" +
                    "Impôt total : " + impotTotal + " ";

            textViewResult.setText(message);

        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Veuillez saisir des valeurs numériques valides", Toast.LENGTH_SHORT).show();
        }
    }
}
