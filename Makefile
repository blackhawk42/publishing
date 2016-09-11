JAVAC=javac
JAVACFLAGS=

DISTDIR=dist/
ZIPFILE=Publishing.zip

JDOC=javadoc
DOCDIR=API/

SOURCES=Publishing.java Book.java Magazine.java
OBJECTS=$(SOURCES:.java=.class)

.PHONY: dist doc

all: java

java: $(SOURCES)
	$(JAVAC) $(JAVACFLAGS) $(SOURCES)

dist: all doc
	mkdir -p $(DISTDIR)
	rm -rf $(DISTDIR)*
	zip $(DISTDIR)$(ZIPFILE) $(SOURCES) $(DOCDIR)* Makefile



clean:
	rm -rf *.class $(DISTDIR)* $(DOCDIR)*

doc:
	mkdir -p $(DOCDIR)
	$(JDOC) -d $(DOCDIR) $(SOURCES)
