## Membros do grupo:
- Luisa Vasconcelos de Castro Toledo - 2020006795
- Maria Luiza Leão Silva - 2020100953

## Explicação do sistema

O sistema é composto por 3 classes principais: `Main`, `Election` e `Candidate`. A classe `Main` é responsável por executar o programa, enquanto `Election` e `Candidate` são responsáveis por gerenciar a eleição e os candidatos, respectivamente. Além disso, existem as classes `Employee` e `Voter` que são responsáveis por gerenciar os funcionários e eleitores, respectivamente. Por fim, existe a classe `Utils` que contém métodos auxiliares para a execução do programa. 
A principal função do sistema é gerenciar uma eleição, onde é possível cadastrar candidatos, eleitores e funcionários, iniciar e finalizar a eleição, votar e mostrar o resultado final da eleição. Para isso, o sistema conta com dois tipos de funcionários: o gestor de sessão e o gestor de candidaturas. O primeiro é responsável por iniciar e finalizar a eleição, enquanto o segundo é responsável por cadastrar e remover candidatos da eleição. Além disso, o sistema conta com dois tipos de eleitores: eleitores comuns e eleitores com necessidades especiais. Os eleitores comuns podem votar normalmente, enquanto os eleitores com necessidades especiais podem votar com auxílio de um mesário.
O sistema utiliza um broker para gerenciar as urnas de diferentes estados e direcionar o voto para a urna correta. Ademais, é utilizado um serverProxy para criar uma interface entre o cliente e o servidor, que é responsável por gerenciar os funcionários e eleitores. Por fim, é utilizado um server para gerenciar a eleição e os candidatos.
O sistema foi impletado em Java.

Testando

## Comandos make

- `make` ou `make full`: Buildar + Executar
- `make build`: Buildar
- `make run`: Executar
- `make clean`: Limpa os arquivos `.class` gerados no build

## Como rodar

- Na root do repositório use o comando `make` para fazer o build e executar o programa

## Como utilizar

OBS:

- O sistema já vem inicializado com 2 candidatos a presidente; 3 a deputado federal, sendo dois de MG e um de SP; 3 a governador, com dois de MG e um do ES; 3 ao senado, com 2 de MG e um do ES; 3 a prefeitura, com dois de BH e um de Uberlândia.
- O sistema já vem com os dois gestores (de sessão e de candidaturas)
- O sistema já vem com todos os eleitores possíveis para utilizá-los basta checar o arquivo `voterLoad.txt`

No menu inicial para gerenciar candidatos e eleição siga pela opção 2:

- User: `employee1` , Password: `54321` -> Inicialização/finalização da eleição (liberar pra poder votar) e mostrar o resultado ao final da eleição.
- User: `employee2` , Password: `12345` -> Cadastro e remoção de candidatos da eleição

Além da senha de usuário é necessário a senha da eleição para completar operações relacionadas a gestão da eleição ou candidatos. Essa senha é a palavra `password`

Para votar também existe um eleitor com o título de eleitor nº 123456789012 que pode votar nos candidatos pré-cadastrados
