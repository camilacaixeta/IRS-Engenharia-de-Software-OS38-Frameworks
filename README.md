# Implementação e Reutilização de Software
### Exercício Prático 2 - Frameworks e Reutilização de Software
#### Pós-Graduação em Engenharia de Software - PUC Minas (Oferta 38)
#### Prof.: Pasteur Ottoni de Miranda Júnior

**Exercício 1:** Alunos efetuam matrícula em disciplinas. Disciplinas são classificaas em áreas de conhecimento. As matrículas podem ser feitas de duas formas distintas: ***Presencialmente*** ou ***Virtualmente***. A Matrícula deve incluir um método *variable* e deve ser classe estendida *(extensible)*. A classe Aluno deve possuit as derivadas AlunoComum e AlunoBolsista, e deve ser interface estendida *(incomplete)*.

* Criar um framework e UML-F para esse domínio;
* Criar uma instância do Framework. Essa instância deve incluir métodos adicionais à classe *extensible* e subclasses adicionais à incomplete.

  * O diagrama e arquivo de modelo do Rational Rose se encontram na pasta *resources*, O framework está modelado, e o seu código gerado se encontram dentro da pasta "Aividade_Aberta_1-SistemaDeMatricula". Sua instância, conforme o tutorial fornecido na apostila, está na pasta "runtime-EclipseApplication". A classe Aluno possui duas subclasses: AlunoBolsista e AlunoComum; já a classe Matrícula possui dois novos métodos que tratam a classe TipoMatrícula como enum, já que o código gerado não entende a classe como um enum, de acordo com sua *tag*.
  
**Exercício 2:** Seja um sistema simplificado de gerenciamento de *Campeonatos* (campos nome, data inicial e data final) são constituídos por *Grupos* (campos código e nome), e estes por *Times* (campos código e nome). Times de um mesmo grupo confrontam-se. Times possuem *Jogadores* (campos código e nome). Os campeonatos podem ser de 3 tipos: **Pontos Corridos**, **Mata-mata** e **Híbrido**.

* Criar um framework desse sistema utilizando UML-F. Suponha que a classe jogador possa ser estendida por meio de novas subclasses que designem novos tipos de jogadores *(incomplete)*. Para a classe jogador, defina ao menos duas classes *frozen-spot*. A classe campeonato deve ser *extensible* (deve haver a possibilidade de acréscimo de novos métodos e/ou atributos), e deve possuir ao menos dois métodos *variable*.
* Criar uma instância do framework. Nessa instância, a classe jogador deve ser estendida pela adição de ao menos uma *app-class*. Crie ao menos um método adicional na classe Campeonato e crie ao menos uma variação para um dos métodos variáveis que foi criado no item anterior.
* A partir do modelo (instância) gerado na letra b, gere as classes EMF (do Ecore e de Edição).
* Crie um programa Java que permita incluir, excluir, alterar e cadastrar campeonatos e grupos utilizando-se de GUIs (Swing ou AWT) e que utilize as classes e estruturas geradas pelo EMF, principalmente para CRUD.
