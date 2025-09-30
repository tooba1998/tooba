/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qaswatech.hislop.service;

import com.qaswatech.hislop.dao.InternDao;
import com.qaswatech.hislop.model.InternModel;
import java.util.ArrayList;

/**
 *
 * @author kamra
 */
public class InternService {

    public String insertIntern(InternModel im) {
        InternDao id = new InternDao();
        String message = id.insertIntern(im);
        return message;

    }

    public ArrayList<InternModel> showInterns() {
        InternDao id = new InternDao();
        return id.showInterns();
  }

}
