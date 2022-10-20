/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelo.boleto.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vuelo.boleto.repository.EstadoRegistroTablaRepository;
/**
 *
 * @author ander
 */
@Service
@Transactional
public class EstadoRegistroTablaService {
    @Autowired
    EstadoRegistroTablaRepository repository;
    
}
