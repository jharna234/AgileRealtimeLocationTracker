package com.acegroup.livelocationtracker.di;

import com.acegroup.livelocationtracker.utils.authentication.LoginHandler;
import com.acegroup.livelocationtracker.utils.authentication.SignupHandler;
import com.acegroup.livelocationtracker.view.faculties.FacultyLogin;
import com.acegroup.livelocationtracker.view.students.StudentMainActivity;
import com.acegroup.livelocationtracker.viewmodel.repository.FacultyRepository;
import com.acegroup.livelocationtracker.viewmodel.repository.StudentRepository;

import javax.inject.Singleton;

@Singleton
@dagger.Component(modules = {ApplicationContextModule.class, FirebaseAuthModule.class})
public interface Component {

    void inject(StudentMainActivity studentMainActivity);
 public static
    void inject(LoginHandler loginHandler);

    void inject(StudentRepository studentRepository);

    void inject(FacultyRepository facultyRepository);

    void inject(FacultyLogin facultyLogin);

    void inject(SignupHandler signupHandler);
}
