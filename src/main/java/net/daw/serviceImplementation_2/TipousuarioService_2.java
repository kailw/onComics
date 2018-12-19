package net.daw.serviceImplementation_2;

import net.daw.serviceImplementation_1.*;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import java.util.HashMap;

import net.daw.service.genericServiceImplementation.GenericServiceImplementation;
import net.daw.service.publicServiceInterface.ServiceInterface;

public class TipousuarioService_2 extends GenericServiceImplementation implements ServiceInterface {

    HttpServletRequest oRequest;
    String ob = null;

    public TipousuarioService_2(HttpServletRequest oRequest, String ob) {
        super(oRequest, ob);
        this.oRequest = oRequest;
        this.ob = ob;
    }

}
