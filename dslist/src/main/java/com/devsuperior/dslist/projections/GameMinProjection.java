package com.devsuperior.dslist.projections;


public interface GameMinProjection { //essa interface é usada para criar uma projeção de dados, que é uma forma de retornar apenas os dados necessários de uma entidade
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();    
}
