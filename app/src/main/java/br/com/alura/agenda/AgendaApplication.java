package br.com.alura.agenda;

import android.app.Application;

import br.com.alura.agenda.dao.AlunoDao;
import br.com.alura.agenda.model.Aluno;

@SuppressWarnings("WeakerAccess")
public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AlunoDao dao = new AlunoDao();
        criaAlunosDeTeste(dao);


    }

    private void criaAlunosDeTeste(AlunoDao dao) {
        dao.salva(new Aluno("Maria", "1231321321", "maria@gmail.com"));
        dao.salva(new Aluno("Antonia", "1231321321", "antonia@gmail.com"));
    }
}
