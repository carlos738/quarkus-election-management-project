# quarkus-election-management-project


#FERRAMENTAS USADAS DURANTE O PROJETO:


#BANCO DE DADOS MARIA DB

MariaDB é baseado no MySQL e está disponível sob os termos da licença GPL v2.

É desenvolvido pela Comunidade MariaDB com o principal administrador a Monty Program Ab.

MariaDB é mantido atualizado com a última versão do MySQL.

Na maioria dos aspectos o MariaDB vai funcionar exatamente como o MySQL: todos os comandos, interfaces, bibliotecas e APIs que existem no MySQL também existem no MariaDB. Não há nenhuma necessidade de converter um bancos de dados para migrar para o MariaDB. MariaDB é um verdadeiro substituto para o MySQL! Além disso, o MariaDB tem um monte de novas funcionalidades agradáveis ​​que você pode aproveitar.



#DOCKER


O Docker é uma plataforma open source que facilita a criação e administração de ambientes isolados. Ele possibilita o empacotamento de uma aplicação ou ambiente dentro de um container, se tornando portátil para qualquer outro host que contenha o Docker instalado. Então, você consegue criar, implantar, copiar e migrar de um ambiente para outro com maior flexibilidade. A ideia do Docker é subir apenas uma máquina, ao invés de várias. E, nessa única máquina, você pode rodar várias aplicações sem que haja conflitos entre elas.

Vale lembrar que a tecnologia e a empresa compartilham o mesmo nome. A empresa Docker Inc. desenvolve a tecnologia com base no trabalho realizado pela comunidade do Docker. Essa comunidade trabalha gratuitamente para melhorar essas tecnologias em benefícios de todos.
Então, podemos dizer que o Docker é uma máquina virtual?

O Docker é algo parecido com uma máquina virtual extremamente leve, mas não se trata de fato de uma máquina virtual. O Docker utiliza containers que possuem uma arquitetura diferente, permitindo maior portabilidade e eficiência. O container exclui a virtualização e muda o processo para o Docker. Então, não podemos dizer que o Docker é uma máquina virtual. Veja na imagem abaixo as diferenças entre o Docker e uma virtualização.

#POSTMAN

O Postman é uma ferramenta que dá suporte à documentação das requisições feitas pela API. Ele possui ambiente para a documentação, execução de testes de APIs e requisições em geral.

#GRAYLOG

O Graylog é uma ferramenta de código aberto cuja função é extrair dados de LOG dos servidores. As informações coletadas são exibidas em um dashboard, ou seja, o usuário as analisa via interface web.

Um dos fatores que colocam o propósito do Graylog em prática é a sua estrutura. Quanto a isso, cabe ressaltar que o programa é integrado a outros dois elementos: banco de dados e servidor de buscas.

O banco de dados, obviamente, exerce a função de armazenamento e disponibilização dos arquivos LOG. Já o servidor de buscas (geralmente, usamos um programa chamado Elasticsearch), possibilita a pesquisa de arquivos.

Ambos interagem com o servidor do Graylog, o qual sincroniza seus recursos e dados ao dashbobard, resultando numa excelente solução para auxiliar no monitoramento de rede.

#SWAGGER

Trata-se de uma aplicação open source que auxilia desenvolvedores nos processos de definir, criar, documentar e consumir APIs REST.  Em suma, o Swagger visa padronizar este tipo de integração, descrevendo os recursos que uma API deve possuir, como endpoints, dados recebidos, dados retornados, códigos HTTP e métodos de autenticação, entre outros.

Ele simplifica o processo de escrever APIs, especificando os padrões e fornecendo as ferramentas necessárias para escrever APIs seguras, com alto desempenho e escaláveis.

No mundo do software de hoje, não há sistemas rodando on-line sem expor uma API. Passamos de sistemas monolíticos para microsserviços. E todo o design de microsserviços é baseado em APIs REST.

#QUARKUS


O Quarkus é uma estrutura de código aberto para criar aplicativos Java modernos com configuração zero. Ele usa um compilador para gerar código nativo para a plataforma em que você está executando, então você não precisa fazer nada além de escrever seu código.

