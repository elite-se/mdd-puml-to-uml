# Serializer

## Usage

* The Serializer is composed of multiple parts, two important ones are the Semantic Sequencer and the Formatter, stubs need to be generated in the ``.mwe2`` file to use them.
  * The Formatter can be only used to add or remove spaces
  * The Semantic Sequencer can be used to change the contents of the fields in the Ecore objects
* Xtext will use the serializer when the Ecore Model is updated to generate the Textual representation of the changed Ecore Model
  * See the Quickfixes, where the formatter is used
* A Wrapper for the Serializer can be used to do some postprocessing on the serialized String

## Example

* For a working example please see the [serialization branch](https://github.com/dat-leth/mdd-puml-to-uml/tree/serialization)
 
## References

* https://fr.slideshare.net/meysholdt/serializing-emf-models-with-xtext
* https://mleduc.xyz/xtext/emf/2018/02/28/xtext-serialization.html
* https://stackoverflow.com/questions/12302206/convert-object-to-xtext-dsl
* https://jevopisdeveloperblog.blogspot.com/2011/03/implement-tostring-with-xtexts.html
