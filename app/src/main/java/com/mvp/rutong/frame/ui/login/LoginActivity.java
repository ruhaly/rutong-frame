package com.mvp.rutong.frame.ui.login;

import android.widget.Button;
import android.widget.TextView;

import com.mvp.rutong.frame.R;
import com.mvp.rutong.frame.base.BaseActivity;
import com.mvp.rutong.frame.cmp.login.LoginContract;
import com.mvp.rutong.frame.cmp.login.LoginModel;
import com.mvp.rutong.frame.cmp.login.LoginPresenter;

import butterknife.BindView;

public class LoginActivity extends BaseActivity<LoginPresenter, LoginModel> implements LoginContract.View {


    @BindView(R.id.id_name)
    TextView idName;
    @BindView(R.id.id_pwd)
    TextView idPwd;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        btnLogin.setOnClickListener(v -> mPresenter.login(idName.getText().toString(), idPwd.getText().toString()));
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
    }

    @Override
    public void loginSuccess() {

    }

    @Override
    public void showMsg(String msg) {

    }

}
