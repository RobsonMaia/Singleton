# Singleton
> Exemplo do padrão Singleton
```
 Singleton é um padrão de projeto criacional que permite a você garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância.
 Neste exemplo, a classe de conexão com a base de dados age como um Singleton. Essa classe não tem um construtor público, então a única maneira de obter seu objeto é chamando o método getInstance. Esse método coloca o primeiro objeto criado em cache e o retorna em todas as chamadas subsequentes.
# Como implementar
1.Adicione um campo privado estático na classe para o armazenamento da instância singleton.

2.Declare um método de criação público estático para obter a instância singleton.

3.Implemente a “inicialização preguiçosa” dentro do método estático. Ela deve criar um novo objeto na sua primeira chamada e colocá-lo no campo estático. O método deve sempre retornar aquela instância em todas as chamadas subsequentes.

4.Faça o construtor da classe ser privado. O método estático da classe vai ainda ser capaz de chamar o construtor, mas não os demais objetos.

5.Vá para o código cliente e substitua todas as chamadas diretas para o construtor do singleton com chamadas para seu método de criação estático.
 # Sugestão de uso.
 Utilize o padrão Singleton quando uma classe em seu programa deve ter apenas uma instância disponível para todos seus clientes; por exemplo, um objeto de base de dados único compartilhado por diferentes partes do programa.
```
