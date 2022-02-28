# Webflux project
 Projeto de API REST com Spring WebFlux e MongoDB

### Recursos
- API REST: API para criar integração com BackEnd
- MongoDB: Banco de dados Não Relacional, criado em MLab Cloud 
- WebFlux: Serviço reativo funcional, podendo substituir as rotas uri de Controller

### Ferramentas 
- MLab Cloud
- Spring Tool Suite

### Dependências
- Reactive Web
- Reactive MongoDB

### Events Stream
- Programação reativa como no exemplo abaixo
#### Programação Assincrona e não bloqueante
- É uma programação que permite realizar outras requisições antes de finalizar as anteriores.
- Esta programação foi criada no projeto liberando 1 lista a cada 10 segundos no metodo GET que busca todas as listas
Podemos conferir no link abaixo

'''
http://localhost:8080/atividade/webflux
'''


### Para conectar ao banco de dados

Ao criar o Banco de dados em [MLab Cloud](https://mlab.com/), você deverá ir em 'Database>Connect' e copiar o link como no exemplo abaixo para colar no properts da sua aplicação, substituindo o '<username>' e '<password>' pelo usuario e senha que foi cadastrado para acessar o banco de dados
 
'''
mongodb+srv://<username>:<password>@cluster0.qihhv.mongodb.net/myFirstDatabase?retryWrites=true&w=majority
'''
