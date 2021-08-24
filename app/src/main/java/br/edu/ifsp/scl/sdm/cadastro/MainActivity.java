package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import br.edu.ifsp.scl.sdm.cadastro.model.Formulario;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEt;
    private EditText phoneEt;
    private EditText emailEt;
    private CheckBox emailCb;
    private RadioButton maleRb;
    private RadioButton fameRb;
    private EditText cityEt;
    private Spinner stateSp;
    private Button cleanBt;
    private Button saveBt;

    private Formulario formulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEt = findViewById(R.id.nameEt);
        phoneEt = findViewById(R.id.phoneEt);
        emailEt = findViewById(R.id.emailEt);
        emailCb = findViewById(R.id.emailCb);
        maleRb = findViewById(R.id.maleRb);
        fameRb = findViewById(R.id.fameRb);
        cityEt = findViewById(R.id.cityEt);
        stateSp = findViewById(R.id.stateSp);
        cleanBt = findViewById(R.id.cleanBt);
        cleanBt.setOnClickListener(this);
        saveBt = findViewById(R.id.saveBt);
        saveBt.setOnClickListener(this);
    }

    private Formulario getDataForm() {
        this.formulario = new Formulario();
        this.formulario.setName(this.nameEt.getText().toString());
        this.formulario.setPhone(this.phoneEt.getText().toString());
        this.formulario.setEmail(this.emailEt.getText().toString());
        this.formulario.setEmailList(this.emailCb.isChecked());
        this.formulario.setMale(this.maleRb.isChecked());
        this.formulario.setFame(this.fameRb.isChecked());
        this.formulario.setCity(this.cityEt.getText().toString());
        this.formulario.setState((String) ((TextView) this.stateSp.getSelectedView()).getText());

        return formulario;
    }

    private void resetDataForm() {
        this.nameEt.setText("");
        this.phoneEt.setText("");
        this.emailEt.setText("");
        this.emailCb.setChecked(false);
        this.maleRb.setChecked(true);
        this.fameRb.setChecked(false);
        this.cityEt.setText("");
        this.stateSp.setSelection(0);

        this.nameEt.requestFocus();
    }

    @Override
    public void onClick(View view) {

        Formulario formularioCadastrar = getDataForm();

        if (this.saveBt.isPressed()) {
            Toast.makeText(this, formularioCadastrar.toString(), Toast.LENGTH_LONG).show();
        } else if (this.cleanBt.isPressed()) {
            this.resetDataForm();
            Toast.makeText(this, "O formulário foi reiniciado", Toast.LENGTH_SHORT).show();
        }

    }
}