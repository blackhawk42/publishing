JAVAC=javac
JAVACFLAGS=

DISTDIR=dist/
ZIPFILE=Output.zip

JDOC=javadoc
DOCDIR=doc/

SOURCES=Book.java
OBJECTS=$(SOURCES:.java=.class)

.PHONY: dist doc

all: java

java: $(SOURCES)
	$(JAVAC) $(JAVACFLAGS) $(SOURCES)

dist:
	mkdir -p $(DISTDIR)
	rm -rf $(DISTDIR)*
	zip $(DISTDIR)$(ZIPFILE) $(SOURCES) $(OBJECTS) Makefile



clean:
	rm -rf *.class $(DISTDIR)* $(DOCDIR)*

doc:
	mkdir -p $(DOCDIR)
	$(JDOC) -d $(DOCDIR) $(SOURCES)
