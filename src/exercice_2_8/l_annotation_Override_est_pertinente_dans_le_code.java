package exercice_2_8;

L'annotation @Override est pertinente car elle permet au compilateur de vérifier que la méthode redéfinie correspond à une méthode de la classe parente, et cela permet d'éviter des erreur lier a un mauvais nom de méthode ou encore des parametre incorrects.
Si on s'en dispense, le code fonctionne toujours, mais on perd cette vérification et en cas d'erreur il sera difficile de la detecter lors de la compilation.
