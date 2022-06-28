Crie um programa que simule um game de desarmamento de uma
bomba. O programa deve pedir para o usuário que escolha um fio
dentre 6 existentes (o usuário deve digitar um número de 1 a 6). Ao
escolher um fio, o programa deve fazer um cálculo aleatório
utilizando Math.random() ou qualquer outro método de sua
preferência. Caso o número gerado seja par, a bomba irá explodir, ou
seja, uma exceção deve ser lançada e, dentro do tratamento desta
exceção deve haver uma mensagem que informe o usuário que a
bomba explodiu e o jogo terminou. Mas caso o número gerado seja
ímpar, o usuário poderá escolher outro fio a ser cortado. Caso o
usuário consiga cortar 2 fios sem lançar nenhuma exceção, ele vence
o jogo; caso contrário, perde. 