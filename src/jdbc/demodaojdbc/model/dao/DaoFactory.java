package jdbc.demodaojdbc.model.dao;

import jdbc.demodaojdbc.model.impl.SellerDaoJDBC;
import jdbc.exemplo1.DB;

//Classe responsável por fornecer instâncias de objetos DAO (Data Access Object) para interagir com o banco de dados.
// A classe DaoFactory atua como uma fábrica de objetos DAO, permitindo que outras partes do sistema obtenham instâncias de DAO sem precisar conhecer os detalhes de implementação.
// Ela encapsula a lógica de criação dos objetos DAO, promovendo o princípio de inversão de controle e facilitando a manutenção e evolução do código.
public class DaoFactory {

    //Método estático que cria e retorna uma instância de SellerDaoJDBC, que é a implementação concreta da interface SellerDao.
    // Ele utiliza a implementação SellerDaoJDBC para fornecer a funcionalidade de acesso a dados para a entidade Seller.
    // Ao chamar esse método, outras partes do sistema podem obter uma instância de SellerDao
    // sem precisar se preocupar com a implementação específica, promovendo o desacoplamento entre
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
